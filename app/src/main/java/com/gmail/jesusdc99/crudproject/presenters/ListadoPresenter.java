package com.gmail.jesusdc99.crudproject.presenters;

import com.gmail.jesusdc99.crudproject.interfaces.ListadoInterface;
import com.gmail.jesusdc99.crudproject.models.Game;
import com.gmail.jesusdc99.crudproject.models.GameModel;

import java.util.ArrayList;

public class ListadoPresenter implements ListadoInterface.Presenter {

    private ListadoInterface.View view;
    private GameModel model;

    public ListadoPresenter(ListadoInterface.View view) {
        this.view = view;
        this.model = GameModel.getInstance();
    }

    @Override
    public void onClickAdd() {
        view.launchForm(-1);
    }

    @Override
    public void onClickSobreAppCRUD() {
        view.launchAbout();
    }

    @Override
    public void onClickBuscar() {
        view.launchBuscar();
    }

    @Override
    public void onClickAyuda() {
        view.launchAyuda();
    }

    /*@Override
    public ArrayList<Game> getAllGames() {
        return model.getAllGames();
    }*/

    @Override
    public ArrayList<Game> getGamesByCriteria(String title, String platform, String date) {
        return model.getGamesByCriteria(title, platform, date);
    }

    @Override
    public void onClickRecyclerView(int id) {
        view.launchForm(id);
    }

    @Override
    public void initializeDatabase() {
        model.initDB();
    }
}
