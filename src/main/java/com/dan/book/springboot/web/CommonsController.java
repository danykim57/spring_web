package com.dan.book.springboot.web;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.PumpStreamHandler;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class CommonsController {

    public void runner() {

        System.out.println("Testing of Running Python");
        String[] command =new String[4];
        command[0] = "python";
        command[1] = "C://test.py";
        command[2] = "10";
        command[3] = "20";
        try {
            runPython(command);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public static void runPython(String[] command) throws IOException, InterruptedException {
        CommandLine commandLine = CommandLine.parse(command[0]);
        for (int i=1 ; i < command.length; i++) {
            commandLine.addArgument(command[i]);
        }

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PumpStreamHandler pumpStreamHandler = new PumpStreamHandler(outputStream);
        DefaultExecutor executor = new DefaultExecutor();
        executor.setStreamHandler(pumpStreamHandler);
        int result = executor.execute(commandLine);
        System.out.println("result: " + result);
        System.out.println("output " + outputStream.toString());
    }
}
