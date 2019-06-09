package com.example.estagio;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class VagasAdapter extends ArrayAdapter<VagasAtributos> {

    private  final Context context;
    private final ArrayList<VagasAtributos> elementos;

    public VagasAdapter(Context context, ArrayList<VagasAtributos> elementos) {
        super(context, R.layout.layout_vagas, elementos);
        this.context = context;
        this.elementos = elementos;
    }

    @ Override public View getView (int position, View convertView , ViewGroup parent ){

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate (R.layout.layout_vagas , parent , false );
        ImageView imagem = ( ImageView ) rowView.findViewById(R.id.imagem);
        TextView titulo = ( TextView ) rowView.findViewById(R.id.titulo);
        TextView nome_empresa = ( TextView ) rowView.findViewById(R.id.nome_empresa);
        TextView remuneracao = ( TextView ) rowView.findViewById(R.id.remuneracao);
        TextView carga_horaria = ( TextView ) rowView.findViewById(R.id.carga_horaria);
        TextView turno = (TextView) rowView.findViewById(R.id.turno);
        TextView tempo = (TextView) rowView.findViewById(R.id.tempo);
        ImageView selo = (ImageView) rowView.findViewById(R.id.selo);

        imagem.setImageResource (elementos.get(position).getImagem());
        titulo.setText (elementos.get(position).getTitulo());
        nome_empresa.setText (elementos.get(position).getNome_empresa());
        remuneracao.setText (elementos.get(position).getRemuneracao());
        carga_horaria.setText (elementos.get(position).getCarga_horaria());
        turno.setText (elementos.get(position).getTurno());
        tempo.setText (elementos.get(position).getTempo());
        selo.setImageResource (elementos.get(position).getSelo());

        return rowView ;

    }
}
