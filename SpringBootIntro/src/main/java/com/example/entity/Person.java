package com.example.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Person {

		private int pId;
		private String pName;
		private String city;
		
		public Person() {
			
		}

		public Person(int pId, String pName, String city) {
			this.pId = pId;
			this.pName = pName;
			this.city = city;
		}

		public int getpId() {
			return pId;
		}

		public void setpId(int pId) {
			this.pId = pId;
		}

		public String getpName() {
			return pName;
		}

		public void setpName(String pName) {
			this.pName = pName;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		@Override
		public String toString() {
			return "Person [pId=" + pId + ", pName=" + pName + ", city=" + city + "]";
		}
		
		
}
