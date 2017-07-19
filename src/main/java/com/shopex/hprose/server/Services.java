/**
 * 
 */
package com.shopex.hprose.server;

import java.util.HashMap;
import java.util.Map;
import com.shopex.hprose.getdoc.Doc;

/**
 * @author zjq
 *
 */
@SuppressWarnings({ "rawtypes", "unchecked" })
public class Services {

	public  HashMap doc(){
		return Doc.getdoc();
	}
	
	
	
	
}
