package com.gtunes

class Album {

	String title
	static hasMany = [songs: Song]
	static belongsTo = [artist: Artist]
	
    static constraints = {
    	title blank:false 
	}
	
	static mapping = {
		songs cascade: 'delete'
	}
	
	String toString() {
		return title
	}
}
