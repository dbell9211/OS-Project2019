import java.util.*;
import java.io.*;

class Memory
{
    public static String memory[] = new String[1024];
    
    // Reads Memory
    public static String readMemory(int address)
    {
        if (address > memory.length)
            System.out.println("Address is invalid.");
        return memory[address];
    }
    
    public static void writeMemory(int address, String data)
    {
        memory[address] = data;
    }
}
    
