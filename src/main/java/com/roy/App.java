package com.roy;

import com.roy.serivce.TestService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        TestService ts = new TestService();
        System.out.println( "这是第一个上传到GitHub的项目" );
        System.out.println(ts.getMe());
    }
}
