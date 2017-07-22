package com.infotech.people.manangement.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.infotech.people.manangement.app.dao.PeopleManangementDao;
import com.infotech.people.manangement.app.entities.Person;

@Service
public class PeopleManagementService {

	@Autowired
	private PeopleManangementDao peopleManangementDao;

	public List<Person> findByLastName(String lastName, PageRequest pageRequest) {
		return peopleManangementDao.findByLastName(lastName,pageRequest);
	}
}
