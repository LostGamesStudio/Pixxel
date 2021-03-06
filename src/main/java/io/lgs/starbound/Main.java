package io.lgs.starbound;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import io.lgs.starbound.file.ServerProperties;

public class Main {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		File propertiesFile = new File("server.properties");
		ServerProperties serverProperties = new ServerProperties(propertiesFile);
		serverProperties.load();
		
		
		ProcessBuilder pb = new ProcessBuilder(serverProperties.serverLocation());
		pb.redirectErrorStream(true);
		
		new StarboundServer(pb, serverProperties);
	}
}
