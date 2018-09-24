package com.example.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;
import org.springframework.security.oauth2.client.token.grant.code.AuthorizationCodeResourceDetails;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;

@Configuration
@EnableOAuth2Client
public class OktaOpenIdConnectConfig {
	@Value("${okta.clientId}")
	private String clientId;

	@Value("${okta.clientSecret}")
	private String clientSecret;

	@Value("${okta.accessTokenUri}")
	private String accessTokenUri;

	@Value("${okta.userAuthorizationUri}")
	private String userAuthorizationUri;

	@Value("${okta.redirectUri}")
	private String redirectUri;

	@Bean
	public OAuth2ProtectedResourceDetails OktaOpenId() {
		AuthorizationCodeResourceDetails details = new AuthorizationCodeResourceDetails();
		details.setClientId(clientId);
		details.setClientSecret(clientSecret);
		details.setAccessTokenUri(accessTokenUri);
		details.setUserAuthorizationUri(userAuthorizationUri);
		details.setScope(Arrays.asList("openid", "email"));
		details.setPreEstablishedRedirectUri(redirectUri);
		details.setUseCurrentUri(false);
		return details;
	}

	@Bean
	public OAuth2RestTemplate OktaOpenIdTemplate(OAuth2ClientContext clientContext) {
		return new OAuth2RestTemplate(OktaOpenId(), clientContext);
	}
}