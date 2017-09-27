package com.base.engine;

import java.util.Scanner;

import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class MainComponent {
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;
	private static final String TITLE = "3D Engine";
	private boolean isRunning = false;
	
	public MainComponent() {
		isRunning = false;
	}
	
	public void start(){
		if (isRunning)
			return;
		run();
	}
	
	public void stop(){
		if (!isRunning)
			return;
		isRunning = false;
	}
	
	public void run(){
		isRunning = true;
		 while(isRunning){
			 if (Display.isCloseRequested()){
				 stop();
			 }
			 render();
		 }
		 clearUp();
	}
	
	public void render(){
		Window.render();
	}
	
	public void clearUp(){
		
	}
	
	public static void main(String[] args) {
		Window.createWindow(WIDTH, HEIGHT, TITLE);
		MainComponent mainComponent = new MainComponent();
		mainComponent.start();
		mainComponent.stop();
	}
}
