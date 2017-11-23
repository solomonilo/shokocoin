import java.util.Arrays;

public class Block {
	private int previousHash;
	private String[] transactions;
	private int blockHash;
	
	// Constructor
	public Block(int previousHash, String[] transactions)
	{
		this.previousHash = previousHash;
		this.transactions = transactions;
		
		Object[] contents = {Arrays.hashCode(transactions), previousHash};
		 /*
		  Generate a hashcode (aka digital signature) of the previous transactions and 
		  the previousHash
		  */
		this.blockHash = Arrays.hashCode(contents);
	}
	
	// Getters
	public int getPreviousHash()
	{
		return this.previousHash;
	}
	
	public String[] getTransactions()
	{
		return this.transactions;
	}
	
	public int getBlockHash()
	{
		return this.blockHash;
	}
}
