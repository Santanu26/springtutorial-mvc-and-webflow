package com.springframework.springPractice04;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Logger {
	private ConsoleWriter consoleWriter;
	private FileWriter fileWriter;

	public void writeConsole(String text) {
		consoleWriter.write(text);
	}

	public void writeFile(String text) {
		fileWriter.write(text);
	}

}
