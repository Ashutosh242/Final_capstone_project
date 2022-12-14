package com.globallogic.creditcardpayment.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.globallogic.creditcardpayment.entity.Admin;
import com.globallogic.creditcardpayment.entity.User;

@Service
public interface AdminService {

	// GET -> CHECK ADMIN LOGIN
	public String adminLogin(String id, String password);

	// GET ->SHOW ALL ADMIN(USERID AND PASSWORD)
	public List<Admin> showAdmin();

	// POST -> ADD ADMIN ID AND PASSWORD
	public List<Admin> addAdmin(Admin admin);

	// PUT ->UPDATE ADMIN(USERID AND PASSWORD)
	public Admin updateAdmin(Admin admin);

	// DELETE ->DELETE ADMIN
	public String deleteAdmin(long id);

}
