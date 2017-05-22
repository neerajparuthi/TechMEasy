package com.javatpoint.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.RowMapper;


import com.javatpoint.beans.Emp;

public class EmpDao {
	
	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public Boolean save(Emp p){
		//String sql="insert into emp99(Name,Salary,Designation) values("+p.getName()+","+p.getSalary()+","+p.getDesignation()+")";
		
		String sql="insert into emp99(Name,Salary,Designation) values(?,?,?)";
		
		return (Boolean) template.execute(sql, new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				
				ps.setString(1, p.getName());
				ps.setFloat(2, p.getSalary());
				ps.setString(3, p.getDesignation());
				return ps.execute();
			}
			
		});
	}
	
	public void update(Emp p){
		//	String sql="update emp99 set name='"+p.getName()+"',salary="+p.getSalary()+",+ designation='"+p.getDesignation()+"' where id="+p.getId()+"";
	
		String sql="UPDATE emp99 set name=?, salary=?, designation=? WHERE id="+p.getId();
		
		template.update(sql, p.getName(),p.getSalary(),p.getDesignation());
		
		/*return template.execute(sql, new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				
				ps.setString(1, p.getName());
				ps.setFloat(2, p.getSalary());
				ps.setString(3, p.getDesignation());
				ps.setInt(4, p.getId());
				
				return ps.execute();
			}
		});*/
		
	}

	
	
	public int delete(int id){
		String sql="delete from emp99 where id="+id+"";
		return template.update(sql);
	}
	
	public Emp getEmpById(int id){
		String sql="select * from emp99 where id=?";
		return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Emp>(Emp.class));
	}
	
	public List<Emp> getEmployee(){
		return template.query("select * from emp99", new RowMapper<Emp>(){
			
			@Override
			public Emp mapRow(ResultSet rs, int row) throws SQLException {
				Emp e=new Emp();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setSalary(rs.getFloat(3));
				e.setDesignation(rs.getString(4));
				return e;
			}						
		});
	}
	
}
