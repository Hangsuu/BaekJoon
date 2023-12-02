package step.etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Etc1681 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int l = Integer.parseInt(s[1]);
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<10; i++) {
        	if(i!=l) {
        		list.add(i);
        	}
        }
        int index=1;
        StringBuffer sb = new StringBuffer();
        while(true) {
        	if(n/(int)Math.pow(9, index)!=0) {
        		index++;
        	}
        	else {
        		break;
        	}
        }
        if(l!=0) {
        	for(int i=index; i>0; i--) {
        		int tempIndex = list.get(n/(int)Math.pow(9, i));
        		System.out.println(tempIndex);
        		sb.append(list.get(tempIndex)+"");
        		n%=(int)Math.pow(9, i);
        	}
        }
        else {
        	
        }
        bw.write(sb.toString());
        bw.close();
        br.close();
	}
}
