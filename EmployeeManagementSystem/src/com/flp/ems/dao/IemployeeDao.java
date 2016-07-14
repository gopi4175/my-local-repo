package com.flp.ems.dao;
import java.util.Map;
public interface IemployeeDao {
	public void AddEmployee(Map in);
	public void ModifyEmployee(int a);
	public void RemoveEmployee(int y);
	public void SearchEmployee(int z);
	public void getAllEmployee(int x);
}
