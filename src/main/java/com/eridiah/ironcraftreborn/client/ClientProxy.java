package com.eridiah.ironcraftreborn.client;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.eridiah.ironcraftreborn.common.CommonProxy;
import com.eridiah.ironcraftreborn.common.handlers.RegistryHandler;

public class ClientProxy extends CommonProxy 
{
	public void preInit(FMLPreInitializationEvent event)
	{
		super.preInit(event);
	}
	
	public void init(FMLInitializationEvent event)
	{
		super.init(event);
		RegistryHandler.Client();
	}
	
	public void postInit(FMLPostInitializationEvent event)
	{
		super.postInit(event);
	}
}
