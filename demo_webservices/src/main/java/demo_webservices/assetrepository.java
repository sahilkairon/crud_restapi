package demo_webservices;

import org.springframework.data.jpa.repository.JpaRepository;

public interface assetrepository extends JpaRepository<asset_table, Integer> {
    public asset_table findByName(String name);

}