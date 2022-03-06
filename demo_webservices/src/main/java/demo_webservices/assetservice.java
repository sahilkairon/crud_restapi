package demo_webservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class assetservice {
    @Autowired
    private assetrepository repository;

//    post methods
    public asset_table saveAsset(asset_table t){
        return repository.save(t);
    }

    public List<asset_table> saveAssets(List<asset_table> l){
        return repository.saveAll(l);
    }
//    get methods

    public List<asset_table> getAssetTables(){
        return repository.findAll();
    }

    public asset_table getAssetTableById( int id){
        return repository.findById(id).orElse(null);
    }


    public asset_table getAssetTableByName( String name ){
        return repository.findByName(name);
    }

//    delete methods
    public String deleteAssetTable(int id){
        repository.deleteById(id);
        return "asset removed " + id;
    }
//     update method
    public asset_table updateAssetTable(asset_table u){
        asset_table existingasset = repository.findById(u.getId()).orElse(null);
        existingasset.setName(u.getName());
        existingasset.setDescription(u.getDescription());
        existingasset.setCreatedby(u.getCreatedby());
        existingasset.setUpdateby(u.getUpdateby());
        existingasset.setStatus(u.getStatus());
        existingasset.setCreatedDateTime(u.getCreatedDateTime());
        existingasset.setUpdatedDateTime(u.getUpdatedDateTime());
        return repository.save(existingasset);
    }





}