package com.example.composeflavortabs.tabcontent

object TabContentProviderFactory {

    fun create(): TabContentProvider {
        return try {
            // Attempt to load the flavor-specific class
            val clazz =
                Class.forName("com.example.composeflavortabs.tabcontent.CustomContentProvider")
            clazz.getDeclaredConstructor().newInstance() as TabContentProvider
        } catch (e: Exception) {
            // Use default class from main directory
            DefaultTabContentProvider()
        }
    }

}