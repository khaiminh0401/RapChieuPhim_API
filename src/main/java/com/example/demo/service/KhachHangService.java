package com.example.demo.service;

import java.util.List;

import com.example.demo.model.KhachHang;

public interface KhachHangService {
	List<KhachHang> getAllKH();
	KhachHang findKH(String email, String matkhau);
	//KhachHang insertKH()
	int insertFBKH(String tenkh, String email, String idfb, String hinh);
}
