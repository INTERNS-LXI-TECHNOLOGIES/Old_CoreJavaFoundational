public class Ticket{
	int price;
	String pnrNo;
	String trsIdNo;
	int selectPer;
	String[] quotaName =  new String[5];
	int[] quotaPer =  new int[5];
public Ticket(){
	quotaName[0] = "GN (General Quota)";
	quotaName[1] = "TQ (Tatkal Quota)";
	quotaName[2] = "HP (Physically Handicapped Quota)";
	quotaName[3] = "H0 (High Official Quota)";
	quotaName[4] = "DF (Defence Quota)";
	quotaPer[0] = 0;
	quotaPer[1] = 10;
	quotaPer[2] = 30;
	quotaPer[3] = 36;
	quotaPer[4] = 42;
}
public String quota(int selectQuota){
	for (int i = 0;i<5;i++){
		if(selectQuota == i+1)
			selectPer = quotaPer[i];
	}
			return quotaName[selectQuota-1];
}
public int per(){
	return selectPer;
}
}