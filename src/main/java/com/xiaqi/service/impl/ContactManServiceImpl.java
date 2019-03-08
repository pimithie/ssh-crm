package com.xiaqi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xiaqi.dao.ContactManDao;
import com.xiaqi.entity.ContactMan;
import com.xiaqi.service.ContactManService;

@Service
public class ContactManServiceImpl implements ContactManService {
	
	@Autowired
	private ContactManDao contactDao;

	@Override
	@Transactional
	public void addContactMan(ContactMan contactMan) {
		contactDao.save(contactMan);
	}

	@Override
	@Transactional
	public void deleteContactMan(ContactMan contactMan) {
		contactDao.delete(contactMan);
	}

	@Override
	@Transactional
	public void updateContactMan(ContactMan contactMan) {
		contactDao.update(contactMan);
	}

}
