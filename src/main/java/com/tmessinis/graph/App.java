package com.tmessinis.graph;

public class App {

	public static void main(String[] args) {

		CommandExecutor commandExecutor = new CommandExecutorImpl();

		/** Check whether all arguments are in place */
		if (args.length == 2) {
			String graphFileLocation = args[0];
			String commandsFileLocation = args[1];
			commandExecutor.execute(graphFileLocation, commandsFileLocation);
		} else {
			System.err.append("Usage: java -jar target/trains-1.0-SNAPSHOT.jar graph.txt commands.txt");
		}
	}

}