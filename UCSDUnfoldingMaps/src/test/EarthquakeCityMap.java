package test;
//Java utilities libraries
import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
import java.util.List;

//Processing library
import processing.core.PApplet;

//Unfolding libraries
import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.marker.Marker;
import de.fhpotsdam.unfolding.data.PointFeature;
import de.fhpotsdam.unfolding.marker.SimplePointMarker;
import de.fhpotsdam.unfolding.providers.AbstractMapProvider;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.providers.MBTilesMapProvider;
import de.fhpotsdam.unfolding.utils.MapUtils;
import de.fhpotsdam.unfolding.geo.Location;

//Parsing library
import parsing.ParseFeed;

public class EarthquakeCityMap extends PApplet {
	public static String mbTilesString = "blankLight-1-3.mbtiles";
	private UnfoldingMap map;
	public void setup() {
		size(950,600,OPENGL);
		AbstractMapProvider provider = new MBTilesMapProvider(mbTilesString);;
		map=new UnfoldingMap(this,200,50,700,500, provider);
		map.zoomToLevel(2);
		MapUtils.createDefaultEventDispatcher(this, map);
		Location valLoc=new Location(-38.14f,-73.03f);
		SimplePointMarker val=new SimplePointMarker(valLoc);
		map.addMarker(val);
		
	}
	public void draw() {
		background(118,120,122);
		map.draw();
		//addKey();
	}

}
