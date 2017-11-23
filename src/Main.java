import java.util.ArrayList;
import java.util.Arrays;


public class Main {
	
	ArrayList<Block> blockChain = new ArrayList<>();
	
	public static void main(String[] args)
	{
		// The very first block in our chain
		String[] genesisTransactions = {"Shoko send 10 coins to Higashi", "Sol sent 30 coins to Crank"};
		Block genesisBlock = new Block(0, genesisTransactions);
		
		// The second block in our chain | Note that it takes the genesisBlock as a param
		String[] newTransactions = {"WalMart received 2 billion bitcoin", "Microsoft received 3 trillion bitcoin"};
		Block secondBlock = new Block(genesisBlock.getBlockHash(), newTransactions);
		
		// Print out all blocks' hashes in chain
		System.out.println(genesisBlock.getBlockHash());
		System.out.println(secondBlock.getBlockHash());
		
		// Generate hash codes from each list
		// Note: Hash = Digital Signature
		
	}
}
