package demo.repository;

import demo.entity.asset_table;
import org.springframework.data.jpa.repository.JpaRepository;


public interface assetrepository extends JpaRepository<asset_table, Integer> {
    public asset_table findByName(String name);

}
