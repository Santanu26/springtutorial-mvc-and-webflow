package com.springframework.springPractice04;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Logger {
	@Autowired
	private LogWriter consoleWriter;
	@Autowired
	private LogWriter fileWriter;

	public void writeConsole(String text) {
		consoleWriter.write(text);
	}

	public void writeFile(String text) {
		fileWriter.write(text);
	}

}
