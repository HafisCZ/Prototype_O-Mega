package mar21.omega.tileentity;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TE_PowerInterface extends TileEntity{
	private int currentEnergy;
	private int energyConsume;
	private int processSpeed = 200;
	private int maxEnergy = 1000;
	private int progressSpeed;
	private int baseConsume = 100;
	
	public void setEnergy(int Energy)//SETS CURRENT ENERGY HOLDING
	{
		if(this.currentEnergy + Energy >= this.maxEnergy)
		{
			this.currentEnergy = Energy;
		}else{
			this.currentEnergy = 0;	
		}
	}
	
	public void updateEntity()
	{

	}
	
	public void setBaseConsume(int Energy)
	{
		this.baseConsume = Energy;
	}
	
	public void setProcessSpeed(int Speed)
	{
		this.processSpeed = Speed;
	}
	
	public int sendEnergy(int Energy)//SENDS ENERGY TO CURRENT ENERGY HOLDING
	{
		if(this.currentEnergy + Energy > this.maxEnergy)
		{
			this.currentEnergy += Energy;
			return this.currentEnergy;
		}
		return this.currentEnergy;
	}
	
	public int removeEnergy(int Energy)//REMOVE ENERGY FROM CURRENT ENERGY HOLDING
	{
		if(this.currentEnergy - Energy < 0)
		{
			this.currentEnergy -= Energy;
			return this.currentEnergy;
		}
		if(this.currentEnergy < 0)
		{
			this.currentEnergy = 0;
			return this.currentEnergy;
		}
		return this.currentEnergy;
	}
	
	public int getEnergy()//GETS CURRENT ENERGY HOLDING
	{
		return this.currentEnergy;
	}
	
	public void setProgressSpeed(int SpeedU)//SETS PROCESSING SPEED//TODO
	{
		this.progressSpeed = this.processSpeed-(SpeedU*20);
	}
	
	public void setEnergyConsume(int EnergyU)//SETS ENERGY REQUIRED FOR 1 PROCESS//TODO
	{
		this.energyConsume = this.baseConsume-(EnergyU*10);
	}
	
	public int getProgressSpeed()//GETS PROCESSNG SPEED//TODO
	{
		return this.progressSpeed;
	}
	
	public int getEnergyConsume()//GETS ENERGY REQUIRED FOR 1 PROCESS//TODO
	{
		return this.energyConsume;
	}
	
	@Override
	public void readFromNBT(NBTTagCompound tagCompound)
	{
		super.readFromNBT(tagCompound);
		this.currentEnergy = tagCompound.getInteger("energy");
		this.progressSpeed = tagCompound.getInteger("speed");
		this.energyConsume = tagCompound.getInteger("consume");
	}
	
	@Override
	public void writeToNBT(NBTTagCompound tagCompound)
	{
		super.writeToNBT(tagCompound);
        tagCompound.setInteger("energy", this.currentEnergy);
        tagCompound.setInteger("speed", this.progressSpeed);
        tagCompound.setInteger("consume", this.energyConsume);
	}

	public boolean canConsume() {
		if(this.currentEnergy >= this.baseConsume)
		{
			return true;
		}
		return false;
	}
}
