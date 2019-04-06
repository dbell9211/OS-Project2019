package com.kennesaw.edu.os.memory;
import java.util.*;
import java.io.*;

class Disk
{
	private static String[] Disk = new String[1024]; // String array for Disk
	

	// Read Disk
	public static String read(int address)
	{
	    return Disk[address];
	}
	
	// Write to Disk
	public static void write(int address, String data)
	{
	   Disk[address] = data;
	}
}
