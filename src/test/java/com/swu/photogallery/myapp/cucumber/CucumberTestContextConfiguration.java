package com.swu.photogallery.myapp.cucumber;

import com.swu.photogallery.myapp.PhotoGalleryApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = PhotoGalleryApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
