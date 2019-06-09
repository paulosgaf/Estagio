package com.example.estagio;

import android.content.Context;
import android.location.Criteria;
import android.location.LocationManager;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsFragment extends SupportMapFragment implements OnMapReadyCallback,
                    GoogleMap.OnMapClickListener {

    private static final String TAG = "Teste Maps Fragment";

    //contem informações relacionadas ao mapa
    private GoogleMap mMap;

    //faz a gestão de colher a localização
    public LocationManager locationManager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */

 //operações com o mapa
    @Override
    public void onMapReady(GoogleMap googleMap) {

        try {

            mMap = googleMap;

            mMap.getUiSettings().setZoomControlsEnabled(true);

            mMap.setOnMapClickListener(this);

            mMap.setMyLocationEnabled(true);


            //recebe a localização
            locationManager = (LocationManager) getActivity().getSystemService(Context.LOCATION_SERVICE);

            Criteria criteria = new Criteria();

            String provider = locationManager.getBestProvider(criteria, true);


        }catch(SecurityException ex){
            Log.e(TAG, "Error", ex);
        }
        // Move a camera pra Fortaleza no inicio da exibição do mapa

        // Define posição por latitude e longitude de fortaleza
        LatLng fortaleza = new LatLng(-3.7576365,-38.5462747);

        // Adiciona e define a marcação por latitude e longitude de Sydney
        // Estabelece o titulo "Fortaleza"
        mMap.addMarker(new MarkerOptions().position(fortaleza).title("Fortaleza"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(fortaleza));

        //seta o zoom minimo do mapa
        mMap.setMinZoomPreference(11);
    }

    @Override
    public void onMapClick(LatLng latLng) {
        Toast.makeText(getContext(), "Coordenadas:" + latLng.toString(), Toast.LENGTH_SHORT).show();
    }
}
