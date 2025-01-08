package fr.efrei.rag.resource;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import fr.efrei.rag.domain.Document;
import fr.efrei.rag.service.DocumentService;

@RestController
public class DocumentResource {

    private final DocumentService documentService;

    public DocumentResource(DocumentService documentService) {
        this.documentService = documentService;
    }

    @PostMapping("/documents")
    public ResponseEntity<Document> createDocument(@RequestBody Document document) throws URISyntaxException {
        Document result = documentService.buildAndSaveDocument(document);
        return ResponseEntity
                .created(new URI("/documents/" + result.getId()))
                .build();
    }
}

