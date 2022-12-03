package com.King.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.King.model.HotelModel;

@Service
public class HotelServiceImpl implements HotelService {
	@Autowired
	private RestTemplate restTemplate;

	@Value("${hotel.portal.baseUrl}")
	private String baseUrl;

	@Override
	public HotelModel findById(int id) throws Exception {
		String uri = baseUrl + "/hotel/{id}";
		Map<String, Integer> param = new HashMap<>();
		param.put("id", id);
		HotelModel hotelModel = restTemplate.getForObject(uri, HotelModel.class, param);
		return hotelModel;
	}

	public List<HotelModel> findAll() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		String uri = baseUrl + "/hotel/all";
		ResponseEntity<HotelModel[]> exchange = restTemplate.exchange(uri, HttpMethod.GET, entity, HotelModel[].class);
		HotelModel[] body = exchange.getBody();
		List<HotelModel> asList = Arrays.asList(body);
		return asList;
	}

	public List<HotelModel> findAll2() {
		String uri = baseUrl + "/hotel/all";
		HotelModel[] body = restTemplate.getForObject(uri, HotelModel[].class);
		List<HotelModel> asList = Arrays.asList(body);
		return asList;
	}

	public String add(HotelModel model) {
		String uri = baseUrl + "/hotel/add";
		String out = restTemplate.postForObject(uri, model, String.class);

		return out;
	}

}
