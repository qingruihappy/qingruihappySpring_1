package com.qingruihappy4.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.qingruihappy4.dao.LogDao;
import com.qingruihappy4.service.LogService;



@Service
public class LogServiceImpl implements LogService {
	@Autowired
	private LogDao logDao;

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void addLog() {
		logDao.add("addLog" + System.currentTimeMillis());
	}

}
