package com.gtunes

class Song {

	String title
	Integer duration
	
	static belongsTo = Album
	
    static constraints = {
		title blank:false 
		duration min:1  
    }
}
