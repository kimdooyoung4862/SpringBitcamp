package com.bitcamp.web.command;

import org.springframework.stereotype.Component;

@Component
public class Path {
	private String context,js,img,css,fonts;

	public String getContext() {
		return context;
	}

	public String getFonts() {
		return fonts;
	}

	public void setFonts(String fonts) {
		this.fonts = fonts;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public String getJs() {
		return js;
	}

	public void setJs(String js) {
		this.js = js;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getCss() {
		return css;
	}

	public void setCss(String css) {
		this.css = css;
	}
}
