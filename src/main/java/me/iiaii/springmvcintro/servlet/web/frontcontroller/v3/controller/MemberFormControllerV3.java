package me.iiaii.springmvcintro.servlet.web.frontcontroller.v3.controller;

import me.iiaii.springmvcintro.servlet.web.frontcontroller.ModelView;
import me.iiaii.springmvcintro.servlet.web.frontcontroller.v3.ControllerV3;

import java.util.Map;

public class MemberFormControllerV3 implements ControllerV3 {

    @Override
    public ModelView process(Map<String, String> paramMap) {
        return new ModelView("new-form");
    }
}
