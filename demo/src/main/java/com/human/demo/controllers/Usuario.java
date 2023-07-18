package com.human.demo.controllers;



import java.security.Principal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Usuario {
	
	private static final Logger logger = (Logger) LoggerFactory.getLogger(Usuario.class);
	
	
	    @GetMapping("/")
	    public String home(@AuthenticationPrincipal OidcUser user) {
	    	logger.info("user: "+ user.getFullName());
	        return "Welcome, "+ user.getFullName() + user.getEmail()+ user.getAuthorizationCodeHash();
	    }

	



}
