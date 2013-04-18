smart-json-database
===================

A simple JSON database built on SQLite. This is a fork of https://code.google.com/p/smart-json-databsase/, written by dev.kang...@googlemail.com and distributed under the Apache License.  This fork was created for maintenance and feature additions.


Usage:
======
Create the JSONDatabaseConfiguration.xml
In the JSONDatabaseConfiguration.xml you configure the name of your database, the version and if you change the database version a upgrade-class.

You have to put this JSONDatabaseConfiguration.xml to your assets (if your Android-App-Project has no assets - create a assets folder) and the xml must have the name JSONDatabaseConfiguration.xml.

Example:

<?xml version="1.0" encoding="UTF-8"?>

<JSONDatabaseConfiguration> 

        <Database name="JSONDatabase.db" version="1" upgradeClass=""></Database>

</JSONDatabaseConfiguration>

Store and fetch entities
========================

Fetch By Id
===========

try {

        database = JSONDatabase.GetDatabase(this);
        
        JSONEntity book1 = new JSONEntity("Book");
        
        book1.put("Title", "Book 1");
        
        book1.put("Price", 0.50);
        
        int id = database.store(book1);

        JSONEntity book1_2 = database.fetchById(id);
        
        String title = book1_2.getString("Title");

} catch (InitJSONDatabaseExcepiton e) {

e.printStackTrace();
                
} catch (JSONException e) {

e.printStackTrace();
                        
}

Fetch By Field
==============

SearchFields search = SearchFields.Where("Title", "Book 1").Or("Name", "James");

Collection<JSONEntity> entities = database.fetchByFields(search);

Fetch By Type
=============

Collection<JSONEntity> entities = database.fetchByType("Book");

Make Relations
        
JSONEntity book1_2 = database.fetchById(1);

JSONEntity author1 = new JSONEntity("Author");

author1.put("Name", "James");

int id = database.store(author1);

book1_2.addIdToHasMany("writtenBy", id);

int id2 = database.store(book1_2);

JSONEntity author1_2 = database.fetchById(id);

Collection<Integer> collection = author1_2.belongsTo("writtenBy");
