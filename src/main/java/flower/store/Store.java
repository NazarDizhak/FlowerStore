package flower.store;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Store {
    private List<FlowerBucket> flowerBuckets = new ArrayList<>();

    public void addBucket(FlowerBucket flowerBucket) {
        flowerBuckets.add(flowerBucket);
    }

    public List<FlowerBucket> search(FlowerType flowerType) {
        return flowerBuckets.stream()
        .filter(bucket -> bucket.getFlowerPacks()
        .stream().anyMatch(pack -> pack.getFlower().getFlowerType() == flowerType))
        .collect(Collectors.toList());
    }
}
