package com.bitcamp.web.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.bitcamp.web.domain.PathDTO;
import com.bitcamp.web.enums.Path;

@Component
public class ContextFactory extends Factory{
	@Autowired PathDTO path;
	@Autowired ContextFactory contextFactory;
	@Override
	public Object create() {
		return ((ServletRequestAttributes) RequestContextHolder
				.currentRequestAttributes())
				.getRequest()
				.getContextPath();
	}
	public PathDTO path() {
		path.setContext((String)create());
		path.setJs(create()+Path.JS.toString());
		path.setCss(create()+Path.CSS.toString());
		path.setImg(create()+Path.IMG.toString());
		path.setFonts(create()+Path.FONTS.toString());
		return path;
	}
}
