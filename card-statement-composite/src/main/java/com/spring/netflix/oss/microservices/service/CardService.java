package com.spring.netflix.oss.microservices.service;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.netflix.oss.microservices.model.CardVO;

public interface CardService {

	final static String PREFIX = "api/";

	@RequestMapping(value = PREFIX + "cards", method = RequestMethod.GET)
	List<CardVO> getCards();

	@RequestMapping(value = PREFIX + "card/{cardId}", method = RequestMethod.GET)
	CardVO getCard(@PathVariable("cardId") Long cardId);

	@RequestMapping(value = PREFIX
			+ "new-card", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE) // it
	void createCard(@RequestBody CardVO card);
}
