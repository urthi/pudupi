package com.urthi.pudupi.cucumber.stepdefs;

import com.urthi.pudupi.PudupiApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = PudupiApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
