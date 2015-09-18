package com.example.treeexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.Tree;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
@Theme("treeexample")
public class TreeexampleUI extends UI {

	@WebServlet(value = "/*", asyncSupported = true)
	@VaadinServletConfiguration(productionMode = false, ui = TreeexampleUI.class)
	public static class Servlet extends VaadinServlet {
	}

	@Override
	protected void init(VaadinRequest request) {
		
		Tree tree = new Tree("My Tree");
        tree.addItem("Hom");
        tree.addItem("gopu");
        tree.addItem("maya");
        tree.addItem("a");

        List<GrandChild> gclist = new ArrayList<GrandChild>();
        gclist.add(new GrandChild("Hom","Gopu", "Saurav"));
        gclist.add(new GrandChild("Hom","Mayalu", "Saurav"));
        gclist.add(new GrandChild("Hom","Gopu", "Sujan"));
        gclist.add(new GrandChild("Hom","Lali", "Sandeep"));

        Set setName = new HashSet();
        setName.addAll(gclist);
        
//        System.out.println(setName);
        
        for (Object object : setName) {
			System.out.println(object.getClass().getName());
		}
        for (GrandChild grandChild : gclist) {
//			System.out.println(grandChild.getGrand());
//			System.out.println(grandChild.getFather());
//			System.out.println(grandChild.getChild());
			//setParents
        	
        	
			
			
		}
		tree.setParent("gopu", "Hom");
		tree.setParent("maya", "Hom");
		tree.setChildrenAllowed("gopu", true);
		tree.setChildrenAllowed("maya", true);
		tree.setParent("a", "gopu");
		tree.setParent("a", "maya");
		tree.setChildrenAllowed("a", false);
		
		setContent(tree);
	}

}