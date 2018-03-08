package com.lv.redi;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;



public class Test {
	public static void main(String[] args) throws IOException {
		Set<HostAndPort> node=new HashSet<HostAndPort>();
		node.add(new HostAndPort("192.168.166.128", 6381));
		JedisCluster jedisCluster=new JedisCluster(node);
		jedisCluster.set("k1000", "v1000");
		System.out.println(jedisCluster.get("k1000"));
		
	}
}
