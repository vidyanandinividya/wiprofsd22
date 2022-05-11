package w4_d3;

abstract class SMSSender {
	abstract void establishConnectionwithTowers();
	public void sendSMS()
	{
		//checkForDND();
		//checkForTelecomeRules();
		
	}
	abstract void destroyConnectionWithTowers();
	public void checkForDND()
	{
		//Check for number register in DND
		
	}
	public void checkForTelecomRules()
	{
		//check for telecom rules
	}

}
class Airtel extends SMSSender
{

	@Override
	void establishConnectionwithTowers() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void destroyConnectionWithTowers() {
		// TODO Auto-generated method stub
		
	}
	
}
class Vodafone extends SMSSender
{

	@Override
	void establishConnectionwithTowers() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void destroyConnectionWithTowers() {
		// TODO Auto-generated method stub
		
	}
}
