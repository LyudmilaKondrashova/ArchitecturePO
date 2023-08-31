package ru.geekbrains.lesson1.store3D.models;

import java.util.List;

public class Scene {

    private static int counter = 0;

    private int id;
    private List<PoligonalModel> models;
    private List<Flash> flashes;

    {
        id = ++counter;
    }

    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes) {
        this.id = id;
        this.models = models;
        this.flashes = flashes;
    }

    public int modelsCount(Scene scene) {
        return scene.models.size();
    }

    public boolean checkFlashesCount(Scene scene, int count) {
        if (count <= 0) {
            throw new RuntimeException("Количество объектов flash должно быть положительным!");
        }
        return (scene.flashes.size() == count);
    }

    public int getId() {
        return id;
    }
}
