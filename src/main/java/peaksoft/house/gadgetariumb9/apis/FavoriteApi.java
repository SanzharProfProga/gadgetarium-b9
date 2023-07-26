package peaksoft.house.gadgetariumb9.apis;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import peaksoft.house.gadgetariumb9.dto.response.subProductResponse.SubProductResponse;
import peaksoft.house.gadgetariumb9.dto.simple.SimpleResponse;
import peaksoft.house.gadgetariumb9.services.FavoriteService;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/favorite")
@Tag(name = "Favorite API", description = "API for favorite CRUD management")
@CrossOrigin(origins = "*", maxAge = 3600)
@PreAuthorize("hasAnyAuthority('USER')")
public class FavoriteApi {

    private final FavoriteService favoriteService;

    @Operation(summary = "Add or delete", description = "The method adds and, if present, removes")
    @PostMapping("/{subProductId}")
    SimpleResponse addOrDeleteFavorite(@PathVariable Long subProductId) {
        return favoriteService.addAndDeleteFavorite(subProductId);
    }

    @Operation(summary = "Clear favorite", description = "Method to clear selected available USER")
    @DeleteMapping
    SimpleResponse clearFavorite() {
        return favoriteService.clearFavorite();
    }

    @Operation(summary = "Get all favorite", description = "Method exports favorites available to USER himself")
    @GetMapping
    List<SubProductResponse> getAllFavorite() {
        return favoriteService.getAllFavorite();
    }

}
