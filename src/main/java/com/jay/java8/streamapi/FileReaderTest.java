/**
 * 
 */
package com.jay.java8.streamapi;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @author Jayhind Rajpoot
 * @Since May 10, 2018
 */
public class FileReaderTest {
	
	public static void main(String[] args) {
		test1();
	}

	public static void test1() {
		String fileName = "C:\\Users\\jayrajpo\\Desktop\\UAN_Cred.txt";
		try (Stream<String> stream = Files.lines(Paths.get(fileName))){
			stream.forEach(System.out::println);
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
