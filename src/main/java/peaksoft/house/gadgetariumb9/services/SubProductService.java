package peaksoft.house.gadgetariumb9.services;

import org.joda.time.LocalDate;
import peaksoft.house.gadgetariumb9.dto.request.product.ProductRequest;
import peaksoft.house.gadgetariumb9.dto.request.subProduct.SubProductCatalogRequest;
import peaksoft.house.gadgetariumb9.dto.response.subProduct.InfographicsResponse;
import peaksoft.house.gadgetariumb9.dto.response.subProduct.MainPagePaginationResponse;
import peaksoft.house.gadgetariumb9.dto.response.subProduct.SubProductHistoryResponse;
import peaksoft.house.gadgetariumb9.dto.response.subProduct.SubProductPagination;
import peaksoft.house.gadgetariumb9.dto.response.subProduct.SubProductPaginationCatalogAdminResponse;
import peaksoft.house.gadgetariumb9.dto.simple.SimpleResponse;

import java.time.LocalDateTime;
import java.util.List;

public interface SubProductService {

    SubProductPagination getSubProductCatalogs(SubProductCatalogRequest subProductCatalogRequest, int pageSize, int pageNumber);

    InfographicsResponse infographics(String period);
  
    MainPagePaginationResponse getNewProducts(int page, int pageSize);

    MainPagePaginationResponse getRecommendedProducts(int page, int pageSize);

    MainPagePaginationResponse getAllDiscountProducts(int page, int pageSize);

    void addRecentlyViewedProduct (Long productId);

    List<SubProductHistoryResponse> getRecentlyViewedProduct();


   // SubProductPaginationCatalogAdminResponse getGetAllSubProductAdmin(String productType, java.time.LocalDate startDate, java.time.LocalDate endDate, int pageSize, int pageNumber);

    SubProductPaginationCatalogAdminResponse getGetAllSubProductAdmin(String productTyp, LocalDateTime startDate, LocalDateTime endDate, int pageSize, int pageNumber);

    SimpleResponse singleDelete(Long subProductId);

    SimpleResponse multiDelete(List<Long> subProductId);

    SimpleResponse updateSubProduct(Long subProductId , ProductRequest productRequest);

}
